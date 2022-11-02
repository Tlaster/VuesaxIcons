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

public val OutlineGroup.Searchnormal1: ImageVector
    get() {
        if (_searchnormal1 != null) {
            return _searchnormal1!!
        }
        _searchnormal1 = Builder(name = "Searchnormal1", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.5f, 21.75f)
                curveTo(5.85f, 21.75f, 1.25f, 17.15f, 1.25f, 11.5f)
                curveTo(1.25f, 5.85f, 5.85f, 1.25f, 11.5f, 1.25f)
                curveTo(17.15f, 1.25f, 21.75f, 5.85f, 21.75f, 11.5f)
                curveTo(21.75f, 17.15f, 17.15f, 21.75f, 11.5f, 21.75f)
                close()
                moveTo(11.5f, 2.75f)
                curveTo(6.67f, 2.75f, 2.75f, 6.68f, 2.75f, 11.5f)
                curveTo(2.75f, 16.32f, 6.67f, 20.25f, 11.5f, 20.25f)
                curveTo(16.33f, 20.25f, 20.25f, 16.32f, 20.25f, 11.5f)
                curveTo(20.25f, 6.68f, 16.33f, 2.75f, 11.5f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0004f, 22.7499f)
                curveTo(21.8104f, 22.7499f, 21.6204f, 22.6799f, 21.4704f, 22.5299f)
                lineTo(19.4704f, 20.5299f)
                curveTo(19.1804f, 20.2399f, 19.1804f, 19.7599f, 19.4704f, 19.4699f)
                curveTo(19.7604f, 19.1799f, 20.2404f, 19.1799f, 20.5304f, 19.4699f)
                lineTo(22.5304f, 21.4699f)
                curveTo(22.8204f, 21.7599f, 22.8204f, 22.2399f, 22.5304f, 22.5299f)
                curveTo(22.3804f, 22.6799f, 22.1904f, 22.7499f, 22.0004f, 22.7499f)
                close()
            }
        }
        .build()
        return _searchnormal1!!
    }

private var _searchnormal1: ImageVector? = null
