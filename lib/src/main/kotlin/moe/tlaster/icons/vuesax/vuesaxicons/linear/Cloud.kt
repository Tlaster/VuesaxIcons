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

public val LinearGroup.Cloud: ImageVector
    get() {
        if (_cloud != null) {
            return _cloud!!
        }
        _cloud = Builder(name = "Cloud", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.27f, 13.01f)
                curveTo(6.74f, 12.74f, 6.15f, 12.6f, 5.55f, 12.6f)
                curveTo(0.87f, 12.93f, 0.87f, 19.74f, 5.55f, 20.07f)
                horizontalLineTo(16.64f)
                curveTo(17.99f, 20.08f, 19.29f, 19.58f, 20.28f, 18.67f)
                curveTo(23.57f, 15.8f, 21.81f, 10.03f, 17.48f, 9.48f)
                curveTo(15.92f, 0.11f, 2.39f, 3.67f, 5.6f, 12.6f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.8501f, 9.92f)
                curveTo(16.3701f, 9.66f, 16.9401f, 9.52f, 17.5201f, 9.51f)
            }
        }
        .build()
        return _cloud!!
    }

private var _cloud: ImageVector? = null
