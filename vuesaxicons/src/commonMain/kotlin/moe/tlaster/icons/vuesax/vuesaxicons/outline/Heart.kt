package moe.tlaster.icons.vuesax.vuesaxicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.OutlineGroup

public val OutlineGroup.Heart: ImageVector
    get() {
        if (_heart != null) {
            return _heart!!
        }
        _heart = Builder(name = "Heart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 21.6501f)
                curveTo(11.69f, 21.6501f, 11.39f, 21.6101f, 11.14f, 21.5201f)
                curveTo(7.32f, 20.2101f, 1.25f, 15.5601f, 1.25f, 8.6901f)
                curveTo(1.25f, 5.1901f, 4.08f, 2.3501f, 7.56f, 2.3501f)
                curveTo(9.25f, 2.3501f, 10.83f, 3.0101f, 12.0f, 4.1901f)
                curveTo(13.17f, 3.0101f, 14.75f, 2.3501f, 16.44f, 2.3501f)
                curveTo(19.92f, 2.3501f, 22.75f, 5.2001f, 22.75f, 8.6901f)
                curveTo(22.75f, 15.5701f, 16.68f, 20.2101f, 12.86f, 21.5201f)
                curveTo(12.61f, 21.6101f, 12.31f, 21.6501f, 12.0f, 21.6501f)
                close()
                moveTo(7.56f, 3.8501f)
                curveTo(4.91f, 3.8501f, 2.75f, 6.0201f, 2.75f, 8.6901f)
                curveTo(2.75f, 15.5201f, 9.32f, 19.3201f, 11.63f, 20.1101f)
                curveTo(11.81f, 20.1701f, 12.2f, 20.1701f, 12.38f, 20.1101f)
                curveTo(14.68f, 19.3201f, 21.26f, 15.5301f, 21.26f, 8.6901f)
                curveTo(21.26f, 6.0201f, 19.1f, 3.8501f, 16.45f, 3.8501f)
                curveTo(14.93f, 3.8501f, 13.52f, 4.5601f, 12.61f, 5.7901f)
                curveTo(12.33f, 6.1701f, 11.69f, 6.1701f, 11.41f, 5.7901f)
                curveTo(10.48f, 4.5501f, 9.08f, 3.8501f, 7.56f, 3.8501f)
                close()
            }
        }
        .build()
        return _heart!!
    }

private var _heart: ImageVector? = null
