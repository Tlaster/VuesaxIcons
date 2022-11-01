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

public val BoldGroup.Flag: ImageVector
    get() {
        if (_flag != null) {
            return _flag!!
        }
        _flag = Builder(name = "Flag", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0204f, 12.33f)
                lineTo(16.8004f, 11.11f)
                curveTo(16.5104f, 10.86f, 16.3404f, 10.49f, 16.3304f, 10.08f)
                curveTo(16.3104f, 9.63f, 16.4904f, 9.18f, 16.8204f, 8.85f)
                lineTo(18.0204f, 7.65f)
                curveTo(19.0604f, 6.61f, 19.4504f, 5.61f, 19.1204f, 4.82f)
                curveTo(18.8004f, 4.04f, 17.8104f, 3.61f, 16.3504f, 3.61f)
                horizontalLineTo(5.9004f)
                verticalLineTo(2.75f)
                curveTo(5.9004f, 2.34f, 5.5604f, 2.0f, 5.1504f, 2.0f)
                curveTo(4.7404f, 2.0f, 4.4004f, 2.34f, 4.4004f, 2.75f)
                verticalLineTo(21.25f)
                curveTo(4.4004f, 21.66f, 4.7404f, 22.0f, 5.1504f, 22.0f)
                curveTo(5.5604f, 22.0f, 5.9004f, 21.66f, 5.9004f, 21.25f)
                verticalLineTo(16.37f)
                horizontalLineTo(16.3504f)
                curveTo(17.7904f, 16.37f, 18.7604f, 15.93f, 19.0904f, 15.14f)
                curveTo(19.4204f, 14.35f, 19.0404f, 13.36f, 18.0204f, 12.33f)
                close()
            }
        }
        .build()
        return _flag!!
    }

private var _flag: ImageVector? = null
