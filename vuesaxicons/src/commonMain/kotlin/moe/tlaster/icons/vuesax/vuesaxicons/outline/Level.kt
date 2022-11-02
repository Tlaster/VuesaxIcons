package moe.tlaster.icons.vuesax.vuesaxicons.outline

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
import moe.tlaster.icons.vuesax.vuesaxicons.OutlineGroup

public val OutlineGroup.Level: ImageVector
    get() {
        if (_level != null) {
            return _level!!
        }
        _level = Builder(name = "Level", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9995f, 22.7501f)
                curveTo(6.9195f, 22.7501f, 2.4895f, 19.1401f, 1.4695f, 14.1701f)
                curveTo(1.3895f, 13.7601f, 1.6495f, 13.3701f, 2.0495f, 13.2801f)
                curveTo(2.4595f, 13.2001f, 2.8495f, 13.4601f, 2.9395f, 13.8601f)
                curveTo(3.8195f, 18.1401f, 7.6295f, 21.2501f, 11.9995f, 21.2501f)
                curveTo(16.3595f, 21.2501f, 20.1695f, 18.1601f, 21.0595f, 13.9001f)
                curveTo(21.1395f, 13.4901f, 21.5395f, 13.2301f, 21.9495f, 13.3201f)
                curveTo(22.3595f, 13.4001f, 22.6195f, 13.8001f, 22.5295f, 14.2101f)
                curveTo(21.4895f, 19.1501f, 17.0695f, 22.7501f, 11.9995f, 22.7501f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.8109f, 10.81f)
                curveTo(21.4609f, 10.81f, 21.1509f, 10.56f, 21.0809f, 10.2f)
                curveTo(20.2309f, 5.88f, 16.4109f, 2.74f, 12.0009f, 2.74f)
                curveTo(7.6209f, 2.74f, 3.8109f, 5.85f, 2.9409f, 10.13f)
                curveTo(2.8609f, 10.54f, 2.4609f, 10.79f, 2.0509f, 10.71f)
                curveTo(1.6409f, 10.63f, 1.3809f, 10.23f, 1.4709f, 9.82f)
                curveTo(2.4909f, 4.85f, 6.9209f, 1.24f, 12.0009f, 1.24f)
                curveTo(17.1309f, 1.24f, 21.5609f, 4.89f, 22.5509f, 9.91f)
                curveTo(22.6309f, 10.32f, 22.3609f, 10.71f, 21.9609f, 10.79f)
                curveTo(21.9109f, 10.81f, 21.8609f, 10.81f, 21.8109f, 10.81f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 14.25f)
                curveTo(10.76f, 14.25f, 9.75f, 13.24f, 9.75f, 12.0f)
                curveTo(9.75f, 10.76f, 10.76f, 9.75f, 12.0f, 9.75f)
                curveTo(13.24f, 9.75f, 14.25f, 10.76f, 14.25f, 12.0f)
                curveTo(14.25f, 13.24f, 13.24f, 14.25f, 12.0f, 14.25f)
                close()
                moveTo(12.0f, 11.25f)
                curveTo(11.59f, 11.25f, 11.25f, 11.59f, 11.25f, 12.0f)
                curveTo(11.25f, 12.41f, 11.59f, 12.75f, 12.0f, 12.75f)
                curveTo(12.41f, 12.75f, 12.75f, 12.41f, 12.75f, 12.0f)
                curveTo(12.75f, 11.59f, 12.41f, 11.25f, 12.0f, 11.25f)
                close()
            }
        }
        .build()
        return _level!!
    }

private var _level: ImageVector? = null
