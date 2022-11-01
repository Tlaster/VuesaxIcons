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

public val LinearGroup.Videooctagon: ImageVector
    get() {
        if (_videooctagon != null) {
            return _videooctagon!!
        }
        _videooctagon = Builder(name = "Videooctagon", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0799f, 8.58f)
                verticalLineTo(15.42f)
                curveTo(21.0799f, 16.54f, 20.4799f, 17.58f, 19.5099f, 18.15f)
                lineTo(13.5699f, 21.58f)
                curveTo(12.5999f, 22.14f, 11.3999f, 22.14f, 10.4199f, 21.58f)
                lineTo(4.4799f, 18.15f)
                curveTo(3.5099f, 17.59f, 2.9099f, 16.55f, 2.9099f, 15.42f)
                verticalLineTo(8.58f)
                curveTo(2.9099f, 7.46f, 3.5099f, 6.42f, 4.4799f, 5.85f)
                lineTo(10.4199f, 2.42f)
                curveTo(11.3899f, 1.86f, 12.5899f, 1.86f, 13.5699f, 2.42f)
                lineTo(19.5099f, 5.85f)
                curveTo(20.4799f, 6.42f, 21.0799f, 7.45f, 21.0799f, 8.58f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.75f, 11.9999f)
                verticalLineTo(10.7999f)
                curveTo(9.75f, 9.2599f, 10.84f, 8.6299f, 12.17f, 9.3999f)
                lineTo(13.21f, 9.9999f)
                lineTo(14.25f, 10.5999f)
                curveTo(15.58f, 11.3699f, 15.58f, 12.6299f, 14.25f, 13.3999f)
                lineTo(13.21f, 13.9999f)
                lineTo(12.17f, 14.5999f)
                curveTo(10.84f, 15.3699f, 9.75f, 14.7399f, 9.75f, 13.1999f)
                verticalLineTo(11.9999f)
                close()
            }
        }
        .build()
        return _videooctagon!!
    }

private var _videooctagon: ImageVector? = null
