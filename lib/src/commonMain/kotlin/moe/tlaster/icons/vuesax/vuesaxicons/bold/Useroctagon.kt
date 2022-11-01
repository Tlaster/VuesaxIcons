package moe.tlaster.icons.vuesax.vuesaxicons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BoldGroup

public val BoldGroup.Useroctagon: ImageVector
    get() {
        if (_useroctagon != null) {
            return _useroctagon!!
        }
        _useroctagon = Builder(name = "Useroctagon", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.5119f, 5.85f)
                lineTo(13.5719f, 2.42f)
                curveTo(12.6019f, 1.86f, 11.4019f, 1.86f, 10.4219f, 2.42f)
                lineTo(4.4919f, 5.85f)
                curveTo(3.5219f, 6.41f, 2.9219f, 7.45f, 2.9219f, 8.58f)
                verticalLineTo(15.42f)
                curveTo(2.9219f, 16.54f, 3.5219f, 17.58f, 4.4919f, 18.15f)
                lineTo(10.4319f, 21.58f)
                curveTo(11.4019f, 22.14f, 12.6019f, 22.14f, 13.5819f, 21.58f)
                lineTo(19.5219f, 18.15f)
                curveTo(20.4919f, 17.59f, 21.0919f, 16.55f, 21.0919f, 15.42f)
                verticalLineTo(8.58f)
                curveTo(21.0819f, 7.45f, 20.4819f, 6.42f, 19.5119f, 5.85f)
                close()
                moveTo(12.0019f, 7.34f)
                curveTo(13.2919f, 7.34f, 14.3319f, 8.38f, 14.3319f, 9.67f)
                curveTo(14.3319f, 10.96f, 13.2919f, 12.0f, 12.0019f, 12.0f)
                curveTo(10.7119f, 12.0f, 9.6719f, 10.96f, 9.6719f, 9.67f)
                curveTo(9.6719f, 8.39f, 10.7119f, 7.34f, 12.0019f, 7.34f)
                close()
                moveTo(14.6819f, 16.66f)
                horizontalLineTo(9.3219f)
                curveTo(8.5119f, 16.66f, 8.0419f, 15.76f, 8.4919f, 15.09f)
                curveTo(9.1719f, 14.08f, 10.4919f, 13.4f, 12.0019f, 13.4f)
                curveTo(13.5119f, 13.4f, 14.8319f, 14.08f, 15.5119f, 15.09f)
                curveTo(15.9619f, 15.75f, 15.4819f, 16.66f, 14.6819f, 16.66f)
                close()
            }
        }
        .build()
        return _useroctagon!!
    }

private var _useroctagon: ImageVector? = null
