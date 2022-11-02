package moe.tlaster.icons.vuesax.vuesaxicons.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BulkGroup

public val BulkGroup.Radar1: ImageVector
    get() {
        if (_radar1 != null) {
            return _radar1!!
        }
        _radar1 = Builder(name = "Radar1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 19.75f)
                curveTo(7.73f, 19.75f, 4.25f, 16.27f, 4.25f, 12.0f)
                curveTo(4.25f, 10.64f, 4.61f, 9.31f, 5.28f, 8.14f)
                curveTo(5.49f, 7.78f, 5.95f, 7.66f, 6.3f, 7.86f)
                lineTo(12.37f, 11.35f)
                curveTo(12.73f, 11.56f, 12.85f, 12.01f, 12.65f, 12.37f)
                curveTo(12.44f, 12.73f, 11.99f, 12.85f, 11.63f, 12.65f)
                lineTo(6.25f, 9.56f)
                curveTo(5.93f, 10.33f, 5.76f, 11.16f, 5.76f, 12.0f)
                curveTo(5.76f, 15.45f, 8.56f, 18.25f, 12.01f, 18.25f)
                curveTo(15.46f, 18.25f, 18.26f, 15.45f, 18.26f, 12.0f)
                curveTo(18.26f, 8.55f, 15.46f, 5.75f, 12.01f, 5.75f)
                curveTo(10.65f, 5.75f, 9.35f, 6.18f, 8.26f, 7.0f)
                curveTo(7.93f, 7.25f, 7.46f, 7.18f, 7.21f, 6.85f)
                curveTo(6.96f, 6.52f, 7.03f, 6.05f, 7.36f, 5.8f)
                curveTo(8.71f, 4.79f, 10.32f, 4.25f, 12.01f, 4.25f)
                curveTo(16.28f, 4.25f, 19.76f, 7.73f, 19.76f, 12.0f)
                curveTo(19.76f, 16.27f, 16.27f, 19.75f, 12.0f, 19.75f)
                close()
            }
        }
        .build()
        return _radar1!!
    }

private var _radar1: ImageVector? = null
