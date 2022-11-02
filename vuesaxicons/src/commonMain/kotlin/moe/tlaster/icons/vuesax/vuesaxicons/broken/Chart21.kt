package moe.tlaster.icons.vuesax.vuesaxicons.broken

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
import moe.tlaster.icons.vuesax.vuesaxicons.BrokenGroup

public val BrokenGroup.Chart21: ImageVector
    get() {
        if (_chart21 != null) {
            return _chart21!!
        }
        _chart21 = Builder(name = "Chart21", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 13.01f)
                verticalLineTo(15.0f)
                curveTo(2.0f, 20.0f, 4.0f, 22.0f, 9.0f, 22.0f)
                horizontalLineTo(15.0f)
                curveTo(20.0f, 22.0f, 22.0f, 20.0f, 22.0f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(22.0f, 4.0f, 20.0f, 2.0f, 15.0f, 2.0f)
                horizontalLineTo(9.0f)
                curveTo(4.0f, 2.0f, 2.0f, 4.0f, 2.0f, 9.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.5f, 11.57f)
                verticalLineTo(16.5f)
                curveTo(17.5f, 17.6f, 16.61f, 18.5f, 15.5f, 18.5f)
                curveTo(14.4f, 18.5f, 13.5f, 17.6f, 13.5f, 16.5f)
                verticalLineTo(7.5f)
                curveTo(13.5f, 6.4f, 14.4f, 5.5f, 15.5f, 5.5f)
                curveTo(16.6f, 5.5f, 17.5f, 6.4f, 17.5f, 7.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.5f, 18.5f)
                curveTo(9.6f, 18.5f, 10.5f, 17.6f, 10.5f, 16.5f)
                verticalLineTo(13.0f)
                curveTo(10.5f, 11.9f, 9.6f, 11.0f, 8.5f, 11.0f)
                curveTo(7.4f, 11.0f, 6.5f, 11.9f, 6.5f, 13.0f)
                verticalLineTo(16.5f)
                curveTo(6.5f, 17.6f, 7.39f, 18.5f, 8.5f, 18.5f)
                close()
            }
        }
        .build()
        return _chart21!!
    }

private var _chart21: ImageVector? = null
