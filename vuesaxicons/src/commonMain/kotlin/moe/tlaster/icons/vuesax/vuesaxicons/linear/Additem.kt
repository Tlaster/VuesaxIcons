package moe.tlaster.icons.vuesax.vuesaxicons.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.Additem: ImageVector
    get() {
        if (_additem != null) {
            return _additem!!
        }
        _additem = Builder(name = "Additem", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 16.0f)
                horizontalLineTo(5.43f)
                curveTo(3.14f, 16.0f, 2.0f, 14.86f, 2.0f, 12.57f)
                verticalLineTo(5.43f)
                curveTo(2.0f, 3.14f, 3.14f, 2.0f, 5.43f, 2.0f)
                horizontalLineTo(10.0f)
                curveTo(12.29f, 2.0f, 13.43f, 3.14f, 13.43f, 5.43f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.57f, 22.0f)
                horizontalLineTo(14.0f)
                curveTo(11.71f, 22.0f, 10.57f, 20.86f, 10.57f, 18.57f)
                verticalLineTo(11.43f)
                curveTo(10.57f, 9.14f, 11.71f, 8.0f, 14.0f, 8.0f)
                horizontalLineTo(18.57f)
                curveTo(20.86f, 8.0f, 22.0f, 9.14f, 22.0f, 11.43f)
                verticalLineTo(18.57f)
                curveTo(22.0f, 20.86f, 20.86f, 22.0f, 18.57f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.87f, 15.0f)
                horizontalLineTo(18.13f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.5f, 16.6301f)
                verticalLineTo(13.3701f)
            }
        }
        .build()
        return _additem!!
    }

private var _additem: ImageVector? = null
