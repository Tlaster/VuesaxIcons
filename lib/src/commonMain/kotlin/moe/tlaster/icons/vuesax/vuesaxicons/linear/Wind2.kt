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

public val LinearGroup.Wind2: ImageVector
    get() {
        if (_wind2 != null) {
            return _wind2!!
        }
        _wind2 = Builder(name = "Wind2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 13.1f)
                lineTo(4.5f, 11.6f)
                curveTo(6.04f, 10.68f, 7.96f, 10.68f, 9.5f, 11.6f)
                curveTo(11.04f, 12.52f, 12.96f, 12.52f, 14.5f, 11.6f)
                curveTo(16.04f, 10.68f, 17.96f, 10.68f, 19.5f, 11.6f)
                lineTo(22.0f, 13.1f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 3.9f)
                lineTo(4.5f, 5.4f)
                curveTo(6.04f, 6.32f, 7.96f, 6.32f, 9.5f, 5.4f)
                curveTo(11.04f, 4.48f, 12.96f, 4.48f, 14.5f, 5.4f)
                curveTo(16.04f, 6.32f, 17.96f, 6.32f, 19.5f, 5.4f)
                lineTo(22.0f, 3.9f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 20.1f)
                lineTo(4.5f, 18.6f)
                curveTo(6.04f, 17.68f, 7.96f, 17.68f, 9.5f, 18.6f)
                curveTo(11.04f, 19.52f, 12.96f, 19.52f, 14.5f, 18.6f)
                curveTo(16.04f, 17.68f, 17.96f, 17.68f, 19.5f, 18.6f)
                lineTo(22.0f, 20.1f)
            }
        }
        .build()
        return _wind2!!
    }

private var _wind2: ImageVector? = null
