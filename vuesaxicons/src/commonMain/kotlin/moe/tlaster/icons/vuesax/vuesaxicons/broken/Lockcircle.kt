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

public val BrokenGroup.Lockcircle: ImageVector
    get() {
        if (_lockcircle != null) {
            return _lockcircle!!
        }
        _lockcircle = Builder(name = "Lockcircle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 11.0f)
                verticalLineTo(10.0f)
                curveTo(9.0f, 8.34f, 9.5f, 7.0f, 12.0f, 7.0f)
                curveTo(14.5f, 7.0f, 15.0f, 8.34f, 15.0f, 10.0f)
                verticalLineTo(11.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0004f, 14.6f)
                curveTo(12.3317f, 14.6f, 12.6003f, 14.3314f, 12.6003f, 14.0f)
                curveTo(12.6003f, 13.6687f, 12.3317f, 13.4f, 12.0004f, 13.4f)
                curveTo(11.669f, 13.4f, 11.4004f, 13.6687f, 11.4004f, 14.0f)
                curveTo(11.4004f, 14.3314f, 11.669f, 14.6f, 12.0004f, 14.6f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.5f, 17.0f)
                horizontalLineTo(9.5f)
                curveTo(7.5f, 17.0f, 7.0f, 16.5f, 7.0f, 14.5f)
                verticalLineTo(13.5f)
                curveTo(7.0f, 11.5f, 7.5f, 11.0f, 9.5f, 11.0f)
                horizontalLineTo(14.5f)
                curveTo(16.5f, 11.0f, 17.0f, 11.5f, 17.0f, 13.5f)
                verticalLineTo(14.5f)
                curveTo(17.0f, 16.5f, 16.5f, 17.0f, 14.5f, 17.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 6.0f)
                curveTo(2.75f, 7.67f, 2.0f, 9.75f, 2.0f, 12.0f)
                curveTo(2.0f, 17.52f, 6.48f, 22.0f, 12.0f, 22.0f)
                curveTo(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f)
                curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f)
                curveTo(10.57f, 2.0f, 9.2f, 2.3f, 7.97f, 2.85f)
            }
        }
        .build()
        return _lockcircle!!
    }

private var _lockcircle: ImageVector? = null
