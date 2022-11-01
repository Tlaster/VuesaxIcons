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

public val BrokenGroup.Forwarditem: ImageVector
    get() {
        if (_forwarditem != null) {
            return _forwarditem!!
        }
        _forwarditem = Builder(name = "Forwarditem", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.7294f, 14.9699f)
                curveTo(6.6494f, 14.5699f, 6.6094f, 14.1199f, 6.6094f, 13.6099f)
                verticalLineTo(10.3799f)
                curveTo(6.6094f, 7.6899f, 7.6894f, 6.6099f, 10.3794f, 6.6099f)
                horizontalLineTo(13.6094f)
                curveTo(16.2994f, 6.6099f, 17.3794f, 7.6899f, 17.3794f, 10.3799f)
                verticalLineTo(13.6099f)
                curveTo(17.3794f, 16.2999f, 16.2994f, 17.3799f, 13.6094f, 17.3799f)
                horizontalLineTo(10.3794f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0005f, 5.77f)
                verticalLineTo(9.0f)
                curveTo(22.0005f, 11.69f, 20.9205f, 12.77f, 18.2305f, 12.77f)
                horizontalLineTo(17.3805f)
                verticalLineTo(10.39f)
                curveTo(17.3805f, 7.7f, 16.3005f, 6.62f, 13.6105f, 6.62f)
                horizontalLineTo(11.2305f)
                verticalLineTo(5.77f)
                curveTo(11.2305f, 3.08f, 12.3105f, 2.0f, 15.0005f, 2.0f)
                horizontalLineTo(18.2305f)
                curveTo(20.9205f, 2.0f, 22.0005f, 3.08f, 22.0005f, 5.77f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.77f, 17.38f)
                verticalLineTo(18.23f)
                curveTo(12.77f, 20.92f, 11.69f, 22.0f, 9.0f, 22.0f)
                horizontalLineTo(5.77f)
                curveTo(3.08f, 22.0f, 2.0f, 20.92f, 2.0f, 18.23f)
                verticalLineTo(15.0f)
                curveTo(2.0f, 12.31f, 3.08f, 11.23f, 5.77f, 11.23f)
                horizontalLineTo(6.62f)
            }
        }
        .build()
        return _forwarditem!!
    }

private var _forwarditem: ImageVector? = null
