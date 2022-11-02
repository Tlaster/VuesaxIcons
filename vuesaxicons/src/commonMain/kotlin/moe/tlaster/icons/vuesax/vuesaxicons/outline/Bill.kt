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

public val OutlineGroup.Bill: ImageVector
    get() {
        if (_bill != null) {
            return _bill!!
        }
        _bill = Builder(name = "Bill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9999f, 22.2498f)
                curveTo(11.1799f, 22.2498f, 10.3599f, 21.9898f, 9.6799f, 21.4798f)
                lineTo(4.4699f, 17.5798f)
                curveTo(3.4999f, 16.8498f, 2.9199f, 15.6898f, 2.9199f, 14.4798f)
                verticalLineTo(1.7598f)
                horizontalLineTo(21.0799f)
                verticalLineTo(14.4798f)
                curveTo(21.0799f, 15.6898f, 20.4999f, 16.8498f, 19.5299f, 17.5798f)
                lineTo(14.3199f, 21.4798f)
                curveTo(13.6399f, 21.9898f, 12.8199f, 22.2498f, 11.9999f, 22.2498f)
                close()
                moveTo(4.4199f, 3.2498f)
                verticalLineTo(14.4698f)
                curveTo(4.4199f, 15.2098f, 4.7799f, 15.9198f, 5.3699f, 16.3698f)
                lineTo(10.5799f, 20.2698f)
                curveTo(11.4199f, 20.8998f, 12.5899f, 20.8998f, 13.4299f, 20.2698f)
                lineTo(18.6399f, 16.3698f)
                curveTo(19.2299f, 15.9198f, 19.5899f, 15.2098f, 19.5899f, 14.4698f)
                verticalLineTo(3.2498f)
                horizontalLineTo(4.4199f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 3.25f)
                horizontalLineTo(2.0f)
                curveTo(1.59f, 3.25f, 1.25f, 2.91f, 1.25f, 2.5f)
                curveTo(1.25f, 2.09f, 1.59f, 1.75f, 2.0f, 1.75f)
                horizontalLineTo(22.0f)
                curveTo(22.41f, 1.75f, 22.75f, 2.09f, 22.75f, 2.5f)
                curveTo(22.75f, 2.91f, 22.41f, 3.25f, 22.0f, 3.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 8.75f)
                horizontalLineTo(8.0f)
                curveTo(7.59f, 8.75f, 7.25f, 8.41f, 7.25f, 8.0f)
                curveTo(7.25f, 7.59f, 7.59f, 7.25f, 8.0f, 7.25f)
                horizontalLineTo(16.0f)
                curveTo(16.41f, 7.25f, 16.75f, 7.59f, 16.75f, 8.0f)
                curveTo(16.75f, 8.41f, 16.41f, 8.75f, 16.0f, 8.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 13.75f)
                horizontalLineTo(8.0f)
                curveTo(7.59f, 13.75f, 7.25f, 13.41f, 7.25f, 13.0f)
                curveTo(7.25f, 12.59f, 7.59f, 12.25f, 8.0f, 12.25f)
                horizontalLineTo(16.0f)
                curveTo(16.41f, 12.25f, 16.75f, 12.59f, 16.75f, 13.0f)
                curveTo(16.75f, 13.41f, 16.41f, 13.75f, 16.0f, 13.75f)
                close()
            }
        }
        .build()
        return _bill!!
    }

private var _bill: ImageVector? = null
