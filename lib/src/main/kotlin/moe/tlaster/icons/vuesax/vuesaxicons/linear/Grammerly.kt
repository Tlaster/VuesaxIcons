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

public val LinearGroup.Grammerly: ImageVector
    get() {
        if (_grammerly != null) {
            return _grammerly!!
        }
        _grammerly = Builder(name = "Grammerly", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.07f, 4.9501f)
                curveTo(23.04f, 8.9201f, 22.97f, 15.4f, 18.87f, 19.29f)
                curveTo(15.08f, 22.88f, 8.93f, 22.88f, 5.13f, 19.29f)
                curveTo(1.02f, 15.4f, 0.9499f, 8.9201f, 4.93f, 4.9501f)
                curveTo(8.83f, 1.0401f, 15.17f, 1.0401f, 19.07f, 4.9501f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.8399f, 16.0701f)
                curveTo(13.7199f, 18.0701f, 10.2799f, 18.0701f, 8.1699f, 16.0701f)
            }
        }
        .build()
        return _grammerly!!
    }

private var _grammerly: ImageVector? = null
