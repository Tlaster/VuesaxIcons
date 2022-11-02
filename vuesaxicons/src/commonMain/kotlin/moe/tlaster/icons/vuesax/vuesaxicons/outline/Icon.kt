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

public val OutlineGroup.Icon: ImageVector
    get() {
        if (_icon != null) {
            return _icon!!
        }
        _icon = Builder(name = "Icon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0005f, 22.75f)
                curveTo(7.1205f, 22.75f, 3.1505f, 18.78f, 3.1505f, 13.9f)
                curveTo(3.1205f, 8.17f, 8.5805f, 3.4f, 10.9305f, 1.61f)
                curveTo(11.5605f, 1.13f, 12.4405f, 1.13f, 13.0705f, 1.61f)
                curveTo(15.4205f, 3.43f, 20.8805f, 8.26f, 20.8505f, 13.91f)
                curveTo(20.8505f, 18.78f, 16.8805f, 22.75f, 12.0005f, 22.75f)
                close()
                moveTo(12.0005f, 2.75f)
                curveTo(11.9505f, 2.75f, 11.8905f, 2.77f, 11.8405f, 2.81f)
                curveTo(10.1505f, 4.1f, 4.6305f, 8.71f, 4.6605f, 13.9f)
                curveTo(4.6605f, 17.96f, 7.9605f, 21.25f, 12.0105f, 21.25f)
                curveTo(16.0605f, 21.25f, 19.3605f, 17.96f, 19.3605f, 13.91f)
                curveTo(19.3905f, 8.79f, 13.8605f, 4.12f, 12.1605f, 2.81f)
                curveTo(12.1005f, 2.77f, 12.0505f, 2.75f, 12.0005f, 2.75f)
                close()
            }
        }
        .build()
        return _icon!!
    }

private var _icon: ImageVector? = null
