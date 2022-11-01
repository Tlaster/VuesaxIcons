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

public val LinearGroup.Diagram: ImageVector
    get() {
        if (_diagram != null) {
            return _diagram!!
        }
        _diagram = Builder(name = "Diagram", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 2.0f)
                verticalLineTo(19.0f)
                curveTo(2.0f, 20.66f, 3.34f, 22.0f, 5.0f, 22.0f)
                horizontalLineTo(22.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 17.0f)
                lineTo(9.59f, 11.64f)
                curveTo(10.35f, 10.76f, 11.7f, 10.7f, 12.52f, 11.53f)
                lineTo(13.47f, 12.48f)
                curveTo(14.29f, 13.3f, 15.64f, 13.25f, 16.4f, 12.37f)
                lineTo(21.0f, 7.0f)
            }
        }
        .build()
        return _diagram!!
    }

private var _diagram: ImageVector? = null
