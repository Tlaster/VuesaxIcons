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

public val BrokenGroup.Attachsquare: ImageVector
    get() {
        if (_attachsquare != null) {
            return _attachsquare!!
        }
        _attachsquare = Builder(name = "Attachsquare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 13.02f)
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
                moveTo(12.2009f, 11.8f)
                lineTo(10.7908f, 13.21f)
                curveTo(10.0108f, 13.99f, 10.0108f, 15.26f, 10.7908f, 16.04f)
                curveTo(11.5708f, 16.82f, 12.8408f, 16.82f, 13.6208f, 16.04f)
                lineTo(15.8409f, 13.82f)
                curveTo(17.4009f, 12.26f, 17.4009f, 9.73f, 15.8409f, 8.16f)
                curveTo(14.2809f, 6.6f, 11.7508f, 6.6f, 10.1808f, 8.16f)
                lineTo(7.7609f, 10.58f)
                curveTo(6.4209f, 11.92f, 6.4209f, 14.09f, 7.7609f, 15.43f)
            }
        }
        .build()
        return _attachsquare!!
    }

private var _attachsquare: ImageVector? = null
