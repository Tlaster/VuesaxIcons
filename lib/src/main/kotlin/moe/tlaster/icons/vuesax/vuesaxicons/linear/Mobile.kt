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

public val LinearGroup.Mobile: ImageVector
    get() {
        if (_mobile != null) {
            return _mobile!!
        }
        _mobile = Builder(name = "Mobile", defaultWidth = 18.0.dp, defaultHeight = 22.0.dp,
                viewportWidth = 18.0f, viewportHeight = 22.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 6.0f)
                verticalLineTo(16.0f)
                curveTo(17.0f, 20.0f, 16.0f, 21.0f, 12.0f, 21.0f)
                horizontalLineTo(6.0f)
                curveTo(2.0f, 21.0f, 1.0f, 20.0f, 1.0f, 16.0f)
                verticalLineTo(6.0f)
                curveTo(1.0f, 2.0f, 2.0f, 1.0f, 6.0f, 1.0f)
                horizontalLineTo(12.0f)
                curveTo(16.0f, 1.0f, 17.0f, 2.0f, 17.0f, 6.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.0f, 4.5f)
                horizontalLineTo(7.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 18.1f)
                curveTo(9.856f, 18.1f, 10.55f, 17.406f, 10.55f, 16.55f)
                curveTo(10.55f, 15.694f, 9.856f, 15.0f, 9.0f, 15.0f)
                curveTo(8.1439f, 15.0f, 7.45f, 15.694f, 7.45f, 16.55f)
                curveTo(7.45f, 17.406f, 8.1439f, 18.1f, 9.0f, 18.1f)
                close()
            }
        }
        .build()
        return _mobile!!
    }

private var _mobile: ImageVector? = null
