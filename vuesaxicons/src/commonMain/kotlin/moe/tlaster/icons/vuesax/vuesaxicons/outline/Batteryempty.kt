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

public val OutlineGroup.Batteryempty: ImageVector
    get() {
        if (_batteryempty != null) {
            return _batteryempty!!
        }
        _batteryempty = Builder(name = "Batteryempty", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 19.75f)
                horizontalLineTo(7.0f)
                curveTo(2.59f, 19.75f, 1.25f, 18.41f, 1.25f, 14.0f)
                verticalLineTo(10.0f)
                curveTo(1.25f, 5.59f, 2.59f, 4.25f, 7.0f, 4.25f)
                horizontalLineTo(13.0f)
                curveTo(17.41f, 4.25f, 18.75f, 5.59f, 18.75f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(18.75f, 18.41f, 17.41f, 19.75f, 13.0f, 19.75f)
                close()
                moveTo(7.0f, 5.75f)
                curveTo(3.42f, 5.75f, 2.75f, 6.43f, 2.75f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(2.75f, 17.57f, 3.42f, 18.25f, 7.0f, 18.25f)
                horizontalLineTo(13.0f)
                curveTo(16.58f, 18.25f, 17.25f, 17.57f, 17.25f, 14.0f)
                verticalLineTo(10.0f)
                curveTo(17.25f, 6.43f, 16.58f, 5.75f, 13.0f, 5.75f)
                horizontalLineTo(7.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 15.25f)
                curveTo(20.09f, 15.25f, 19.75f, 14.91f, 19.75f, 14.5f)
                curveTo(19.75f, 14.09f, 20.09f, 13.75f, 20.5f, 13.75f)
                curveTo(21.09f, 13.75f, 21.22f, 13.66f, 21.23f, 13.66f)
                curveTo(21.25f, 13.6f, 21.25f, 13.25f, 21.25f, 13.0f)
                verticalLineTo(11.0f)
                curveTo(21.25f, 10.75f, 21.25f, 10.41f, 21.21f, 10.32f)
                curveTo(21.22f, 10.33f, 21.05f, 10.25f, 20.5f, 10.25f)
                curveTo(20.09f, 10.25f, 19.75f, 9.91f, 19.75f, 9.5f)
                curveTo(19.75f, 9.09f, 20.09f, 8.75f, 20.5f, 8.75f)
                curveTo(22.58f, 8.75f, 22.75f, 9.77f, 22.75f, 11.0f)
                verticalLineTo(13.0f)
                curveTo(22.75f, 14.23f, 22.58f, 15.25f, 20.5f, 15.25f)
                close()
            }
        }
        .build()
        return _batteryempty!!
    }

private var _batteryempty: ImageVector? = null
